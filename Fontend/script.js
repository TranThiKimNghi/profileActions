window.onload = function(){

fetch("http://localhost:8080")
.then(res => res.json())
.then(data => {

let profile = data[data.length - 1];

document.getElementById("name").innerText = profile.name;
document.getElementById("job").innerText = profile.job;
document.getElementById("email").innerText = profile.email;
document.getElementById("phone").innerText = profile.phone;
document.getElementById("address").innerText = profile.address;
document.getElementById("bio").innerText = profile.bio;
document.getElementById("skills").innerText = profile.skills;
document.getElementById("university").innerText = profile.university;
document.getElementById("major").innerText = profile.major;

document.getElementById("github").href = profile.github;
document.getElementById("linkedin").href = profile.linkedin;

});

}