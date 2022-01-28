const express=require("express")
const mongoose=require("mongoose")
const app=express()
mongoose.connect("mongodb+srv://pramod:pramod24@cluster0.n7cvi.mongodb.net/myFirstDatabase?retryWrites=true&w=majority",{useNewUrlParser: true, useUnifiedTopology: true})
const User=mongoose.model("Students",{
    Id:{
        type:String,
        required:[true],
        unique:true
    },
    Cgpa:Number,
    Name:{
        type:String,
        minlength:3
    },
})
const student1=new User({
    Id:"18BCE0339",
    Cgpa:9,
    Name:"Pramod"
})
student1.save().then(()=>console.log("user added sucessfully"))
