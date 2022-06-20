profileData = async () =>{
    let profile = await fetch('http://localhost:8080/User/Perfil=3')
    .then(response => {
        return response.json();
    })
    .catch(error => {
        alert('Problema ao recuperar informações do usuário.');
    })

    console.log(profile)
    document.getElementById("id").value = profile.id;
    document.getElementById("name").value = profile.name;
    document.getElementById("email").value = profile.email;
    document.getElementById("password").value = profile.password;
    document.getElementById("phone").value = profile.phone;
}
let editProfile = () =>{
    document.getElementById("buttons").innerHTML = '<button id="save" onclick="saveProfile()" class="btn btn-primary" type="submit">Salvar</button>';
    document.getElementById("name").removeAttribute('readonly');
    document.getElementById("email").removeAttribute('readonly');
    document.getElementById("phone").removeAttribute('readonly');
    document.getElementById("password").removeAttribute('readonly');
}
saveProfile = async () =>{
    let profile;
    profile = {
        id: document.getElementById("id").value,
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        phone: document.getElementById("phone").value,
        password: document.getElementById("password").value
    }
    await fetch('http://localhost:8080/User/Update', {
        method: 'PUT', 
        body: JSON.stringify(profile), 
        headers: {'Content-Type': 'application/json; charset=UTF-8'} 
    })
    .then(response => {
        console.log(response)
        alert('Atualização realizada com sucesso');
        document.location.reload();
    })
    .catch(error => { 
        alert('Problema na inserção');
    })
}
