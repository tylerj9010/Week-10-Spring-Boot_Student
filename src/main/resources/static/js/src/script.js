function runValidation() {
	let name = document.querySelector("#inName").value;
	let age = document.querySelector("#inAge").value;
	let year = document.querySelector("#inYear").value;
	
	
	
	let reLetters = /^[A-Za-z ]+$/;
	let reAge = /[0-150]/
	let reYear = /[1000-2020]/;
	if (name == null || name == "" || name == undefined || !name.match(reLetters)) {
		alert("Name is invlaid, Form did not submit");
		return false;
	}
	if (age == null || age =="" || age == undefined || isNaN(age) || !age.match(reAge)) {
		alert("age is invlaid, Form did not submit");
		return false;
	}
	
	if (year == null || year == "" || year == undefined || !year.match(reYear)) {
		alert("year is invlaid, Form did not submit");
		return false;
	}
	
	return true;

}