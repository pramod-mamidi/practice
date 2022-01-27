const fs=require("fs")
const path=require("path")

//writing into files

const filepath=path.resolve(__dirname,"sample2.txt")
console.log(filepath)
fs.writeFileSync(filepath,"Hey i am pramod how are you!!")
const filepath2=path.resolve(__dirname,"sample3.html")
fs.writeFileSync(filepath2,"<h1>Hello Welcome to my website</h1>")
const filepath3=path.join(__dirname,"sample4.json")
dta=[{"name":"pramod"},{"name":"harish"}]
d=JSON.stringify(dta)
fs.writeFileSync(filepath3,d)

//Reading from files

const data1=fs.readFileSync(filepath,"utf-8")
console.log(data1)
const data2=fs.readFileSync(filepath2,"utf-8")
console.log(data2)
const data3=fs.readFileSync(filepath3,"utf-8")
console.log(data3)
const data4=fs.readFileSync("../task.html","utf-8")
console.log(data4)

//merge
const pth=path.join(__dirname,"merged.txt")
fs.writeFileSync(pth,data1+data2)