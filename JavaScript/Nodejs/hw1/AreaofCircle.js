function areaOfCircle(radius){
	let area = Math.PI * (radius *1)**2
	console.log("PI x r^2 : "+area)
}

areaOfCircle(process.argv[2])
