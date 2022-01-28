const express=require("express")
const path=require("path")
const app=express()
const fs=require("fs")
const fpth=path.join(__dirname,"/templates/index.html")
const bodyparser=require("body-parser")
app.use(express.static('/templates'))
app.use(bodyparser.json())
const loggerMw=(req,res,next)=>{
    obj={"method":req.method,"url":req.url,"date":new Date().toDateString()}
    p=path.join(__dirname,"dta.json")
    ob=JSON.stringify(obj)
    fs.writeFileSync(p,ob)
    next()
}
app.get('/summary',loggerMw,(req,res)=>{
    const resdata=req.query
    res.sendFile(fpth)
})
app.get('/About',(req,res)=>{
    res.send("Hi how are you")
})
app.get('/Signin',(req,res)=>{
    res.send("we are still working on this page")
})
app.post('/home',(req,res)=>{
    console.log(req.body)
    res.send("sucess")
})
app.all("*",(req,res)=>{
    res.status(404).send("Oops page doesnot exist")
})
app.listen(3004,()=>console.log("server started"))