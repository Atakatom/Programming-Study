const http = require('http');

const server = http.createServer((req, res) => {

    const url = req.url;
    console.log(url);
    
    console.log('A request has been sent');
    
    if(url === '/index'){
        res.writeHead(200, {"Content-Type": "text/html"});
        res.write('<h2>Welcome to Index Page</h2>');
    }else if(url === '/hakkimda'){
        res.writeHead(200, {"Content-Type": "text/html"});
        res.write('<h2>Welcome to About Page</h2>');
    } else if(url === '/iletisim'){
        res.writeHead(200, {"Content-Type": "text/html"});
        res.write('<h2>Welcome to Contact Page</h2>');
    } else {
        res.writeHead(404,{"Content-Type": "text/html"});
        res.write('<h2 style="color: red;">404 Not Found</h2>');
    }
    res.end();
});

const port = 5000;
server.listen(port, () => {
	console.log('Server has started on port '+port)
});
