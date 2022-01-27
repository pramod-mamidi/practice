const path=require("path")
const os=require("os")
const fs=require("fs")
const { title } = require("process")
const filepath=path.join(__dirname,"data.json")
function find(arr,s){
    for(let i=0;i<arr.length;i++){
        console.log(arr[i])
        if(arr[i].title===s){
            return i
        }
    }
    return -1
}
const addNote=(title,date)=>{
    data={"title":title,"date":date}
    data1=fs.readFileSync(filepath,"utf-8")
    dt=JSON.parse(data1)
    if(find(dt,title)!==-1){
        console.log(dt)
        console.log("Data already exists")
    }
    else{
        dt.push(data)
        dtf=JSON.stringify(dt)
        fs.writeFileSync(filepath,dtf)
    }
}
const viewNote=(title)=>{
    data1=fs.readFileSync(filepath)
    dt=JSON.parse(data1)
    let pos=find(dt,title)
    console.log("The date of publish for the following title is"+dt[pos].date)
}
const deleteNote=(title)=>{
    data1=fs.readFileSync(filepath)
    dt=JSON.parse(data1)
    let pos=find(dt,title)
    console.log(pos)
    dt.splice(pos,1)
    dtf=JSON.stringify(dt)
    fs.writeFileSync(filepath,dtf)
}
const showNotes=()=>{
    data1=fs.readFileSync(filepath,"utf-8")
    console.log(data1)
}
module.exports={addNote,viewNote,deleteNote,showNotes}