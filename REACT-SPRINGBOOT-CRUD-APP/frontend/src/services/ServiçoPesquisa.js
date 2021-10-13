import axios from 'axios';

const PESQUISADOS_API_BASE_URL = "http://localhost:8082/api/v1/pesquisados";

//Conexão com backend
class ServiçoPesquisa {

    getPesquisados(){
        return axios.get(PESQUISADOS_API_BASE_URL)
    }

    criaPesquisado(pesquisados) {
        return axios.post(PESQUISADOS_API_BASE_URL, pesquisados);
    }
}

export default new ServiçoPesquisa()