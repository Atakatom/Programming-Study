function areaOfCircle(radius){
	console.log("Area of Circle");
	let area = Math.PI * radius**2
	console.log("PI x r^2 : "+area+"\n")
}

function circumferenceCircle(radius){
	console.log("Circumference of Circle");
	let circumference = 2 * Math.PI * radius;
	console.log("2 x PI x r : "+circumference+"\n");
}

// export default areaOfCircle;
module.exports = { areaOfCircle, circumferenceCircle }