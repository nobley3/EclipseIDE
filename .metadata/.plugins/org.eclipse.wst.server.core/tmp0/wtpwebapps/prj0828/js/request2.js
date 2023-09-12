//alert("dafef");
function hi(){
	//alert("hi");
	let userNameT = document.getElementById("userName");
	let userName = userNameT.value;
	alert(userName);
	
	window.location.href="/prj0828/hi?name="+userName;
}