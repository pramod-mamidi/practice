const express=require("express")
const router=express.Router()
const User=require("../models/UserModule1.js")
router.post("/signup",(req,res)=>{
    const data=req.body;
    const user1=new User({
        email:data.email,
        password:data.password,
        mobile:data.mobile,
        area:data.area,
        pincode:data.pincode,
        adress:data.adress
    })
    user1.save().then(()=>console.log(data))
})
module.exports=router
