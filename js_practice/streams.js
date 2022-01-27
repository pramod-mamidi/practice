const fs=require("fs")
const readerPointer=fs.createReadStream('../bajaj_backend/sample2.txt')
let data=""
//data , end , err
readerPointer.on("data",(chunk)=>{
    console.log("chunk",chunk)
data+=chunk
})
readerPointer.on("end",()=>{
    console.log(data)
    })
readerPointer.on("err",(err)=>{
       console.log(err)
})
