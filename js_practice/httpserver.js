const http=require("http")
const {type}=require("os")
const url=require("url")
const app=http.createServer((req,res)=>{
const querydata=url.parse(req.url,true)
res.writeHead(200,{"Content-Type":"text/html"})
console.log(querydata.pathname)
if(querydata.pathname==="/products"){
    res.write("<h1>products page</h1>")
    res.end
}
console.log(req)
res.write("<h1>request received</h1>")
res.end()
})
app.listen(3000,()=>console.log("server started"))