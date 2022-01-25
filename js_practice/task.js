//Q1
function higher(n,a){
    return n<a;
}
function lower(n,b){
    return n>b;
}

const arr=[2,3,5,6,7,,9,12,3,4,6,17]
a=8;
b=5;
function filterrange(arr,a,b){
    const res=arr.filter(higher.bind(this,a))
    const res1=arr.filter(lower.bind(this,b))
    console.log(res)
    console.log(res1)
}
filterrange(arr,a,b)

//Q2
function unique(arr){
    let s=new Set()
    for(let i=0;i<arr.length;i++){
        s.add(arr[i])
    }
    return Array.from(s)
}
arr1=[1,1,1,2,3,2,3,4,5,6,6,6,7,8,8,6]
const t2=unique(arr1)
console.log(t2)

//Q3
let maxlength=16;
let str="My name is pramod i am 20 years old and i am doing my under grad from vit university"
function truncate(str,maxlength){
    str=str.slice(0,maxlength)+"..."
    return str
}
console.log(truncate(str,maxlength))

//Q4
function extractcurrencyvalue(str){
    str=str.slice(1,str.length)
    return Number(str)
}

str1="$2345"
console.log(extractcurrencyvalue(str1))
