const fs = require('fs');


    fs.writeFile('employees.json','{"name":Atakan", "salary": 20000}','utf-8',(err) => {
        if(err) console.log(err);
        console.log("File is created.");
    })

    fs.readFile('employees.json','utf-8',(err,data) => {
        if(err) console.log(err);
        console.log("File is being read.");
        console.log(data);

    })

    fs.appendFile('employees.json','\n{"name":Mustafa", "salary": 30000}','utf-8',(err) => {
        if(err) console.log(err);
        console.log("File is updated.");
    })

    fs.unlink('employees.json',(err) => {
        if(err) console.log(err);
        console.log("File is deleted.");
    })


