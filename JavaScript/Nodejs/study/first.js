const arguments = process.argv.slice(2);

function showPrimeNumber(lownumber,highnumber){
	for(let i = lownumber; i<= highnumber; i++){
		let isPrime = true;
		for(let j = 2; j < i ;j++){
			if(i%j ===0 && j!==i){
				isPrime = false
			}
		}
		if(isPrime){
			console.log(i);
		}
	}
}

showPrimeNumber(arguments[0]*1,arguments[1]*1)
console.log(process.argv[1]);
console.log(process.argv);