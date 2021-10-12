import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ListaPesquisados from './components/ListaPesquisados';
import Header from './components/Header';
import Footer from './components/Footer';
import CriaDuoDigito from './components/CriaDuoDigito';

function App() {
  return (
    <div>
      <Router>
          <Header/>
            <div className="container">
              <Switch>
                  <Route path = "/" exact component = {ListaPesquisados}></Route>
                  <Route path = "/pesquisados" component = {ListaPesquisados}></Route>
                  <Route path = "/calcula-duodigito" component = {CriaDuoDigito}></Route>
              </Switch>
            </div>
          <Footer/>
      </Router>
    </div>
  );
}

export default App;
