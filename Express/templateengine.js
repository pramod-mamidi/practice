const express=require("express")
const app=express()
app.set("view engine","jade")
app.get("/index",(req,res)=>{
    res.status(200).render("index")
})
app.listen(3000,()=>{console.log("server started")})
