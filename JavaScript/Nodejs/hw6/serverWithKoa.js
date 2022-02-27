const router = require('koa-router')();

const Koa = require('koa');
const app = module.exports = new Koa();

router.get('/', indexPage)
    .get('/index',indexPage)
    .get('/hakkimda',aboutPage)
    .get('/iletisim',contactPage)

app.use(router.routes());

const h1Tag = (s) => {
    return `<h1>${s}</h1>`
}

async function indexPage(ctx) {
    ctx.body = h1Tag('Welcome to the Index Page');
}

async function aboutPage(ctx) {
    ctx.body = h1Tag('Welcome to the About Page');
}

async function contactPage(ctx) {
    ctx.body = h1Tag('Welcome to the Contact Page');
}

if(!module.parent) app.listen(3000)