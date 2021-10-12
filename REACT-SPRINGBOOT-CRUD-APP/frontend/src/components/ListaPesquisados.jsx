import React, { Component } from 'react';
import ServiçoPesquisa from '../services/ServiçoPesquisa';

class ListaPesquisados extends Component {
    constructor(props){
        super(props)

        this.state = {
            pesquisados: []
        }
        this.calculaDuoDigito = this.calculaDuoDigito.bind(this);
    }

    componentDidMount(){
        ServiçoPesquisa.getPesquisados().then((res) => {
            this.setState({ pesquisados: res.data});
        })
    }

    calculaDuoDigito(){
        this.props.history.push('/calcula-duodigito');
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Pesquisas Anteriores</h2>
                <div className = "row">
                    <button className="btn btn-primary" onClick={this.calculaDuoDigito}> Calcular Minimo DuoDigito </button>
                </div>
                <div className = "row">
                    <table className= "table table-striped table-bordered">
                        
                        <thead>
                            <tr>
                                <th>Numero</th>
                                <th>Resultado</th>
                                <th>Tempo (ms)</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.pesquisados.map(
                                    pesquisa =>
                                    <tr key = {pesquisa.id}>
                                        <td> { pesquisa.input} </td>
                                        <td> { pesquisa.resultado} </td>
                                        <td> { pesquisa.tempo} </td>
                                    </tr>
                                )
                            }


                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListaPesquisados;