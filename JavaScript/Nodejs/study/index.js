const http = require('http');

const server = http.createServer((req, res) => {

    const url = req.url;
    console.log(url);
    
    console.log('A request has been sent');
    res.write('MERHABA')
    res.end();
});

const port = 3000;
server.listen(port, () => {
	console.log('Server has started on port '+port)
});
