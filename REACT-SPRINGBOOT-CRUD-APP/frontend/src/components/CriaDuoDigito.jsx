import React, { Component } from 'react';
import ServiçoPesquisa from '../services/ServiçoPesquisa';


class CriaDuoDigito extends Component {
    constructor(props){
        super(props)

        this.state = {
            input: ''
        }
        this.changeNumeroHandler  = this.changeNumeroHandler.bind(this);
        this.pesquisaDuoDigito = this.pesquisaDuoDigito.bind(this);
    }

    changeNumeroHandler = (event) => {
        this.setState({input: event.target.value.replace(/[^0-9]/g, '')});
    }

    pesquisaDuoDigito = (e) => {
        e.preventDefault();
        let pesquisados = {input: this.state.input};
        console.log('Pesquisado => ' + JSON.stringify(pesquisados));

        ServiçoPesquisa.criaPesquisado(pesquisados).then(res => {
            this.props.history.push('/pesquisados');
        });
    }

    render() {
        return (
            <div>
                <div className = "container">
                    <div className = "row">
                        <div className= "card col-md-6 offset-md-3 offset-md-3">
                            <h3 className="text-center"> Calculador de mínimo multiplo DuoDigito </h3>
                            <div className = "card-body">
                                <form>
                                    <div className = "form-group">
                                        <label> Número: </label>
                                        <input placeholder= "Número" name="numero" className="form-control"
                                            value={this.state.input} onChange={this.changeNumeroHandler}/>
                                    </div>
                                    <button className="btn btn-success" onClick={this.pesquisaDuoDigito}> Pesquisar </button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default CriaDuoDigito;