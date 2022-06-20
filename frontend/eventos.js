class eventos {
    constructor (dia, hora, solenidade) {
        this.dia = dia;
        this.hora = hora;
        this.solenidade = solenidade;
    }

    cadastrar = () => {
        await fetch('http://localhost:8080/eventos/cadastrar', {
            method: 'POST', 
            body: JSON.stringify(this.getEvents()), 
            headers: {'Content-Type': 'application/json; charset=UTF-8'} 
        })
        .then(response => {
            console.log(response)
            alert('Atualização realizada com sucesso');
        })
        .catch(error => { 
            alert('Problema na inserção');
        })
    }

    deletar = (id) => {
        if(confirm(`Deseja realmente remover o evento a seguir?`)){
            await fetch(`http://localhost:8080/eventos/remover/${id}`, {
                method: 'POST', 
                body: JSON.stringify(this.getEvents()), 
                headers: {'Content-Type': 'application/json; charset=UTF-8'} 
            })
            .then(response => {
                alert(response.text())
            })
            .catch(error => {
                console.log(error);
            })
        }
    }

    getEvents = () => {
        return {dia: this.dia, hora: this.hora, solenidade: this.solenidade}
    }
}