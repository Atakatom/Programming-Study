const posts = [
    { name: "Today ...", content: "Today, it feels like most articles are trying to sell you something. They are..."},
    { name: "Tomorrow ...", content: "We want quality writings on coding blog to be freely available to everyone. We want..."},
    { name: "How to Get There", content: "coding.blog is still in early stages of development. If you are interested..."}
];

const listPosts = () => {
    let i = 1;
    console.log("****List of all posts****");
    posts.map((post) => {
        console.log(i++ + " : "+post.name);
    });
};

const addPost = (newPost) => {
    console.log("****Adding new post****");
    const promise1 = new Promise((resolve,reject)=> {
        posts.push(newPost);
        resolve(posts);
        reject('There is an error')
    });
    return promise1;
};

async function showPosts(){
    try{
        listPosts();
        await addPost({name:"Yesterday", content:"I don't know what to write I am just filling a sentence..."});
        listPosts();
    } catch (error) {
        console.log(error);
    }
}

showPosts()