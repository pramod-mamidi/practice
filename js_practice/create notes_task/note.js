const { identity } = require("lodash")
const _=require("lodash")
const yargs=require("yargs")
const argv=yargs.argv
const {addNote,viewNote,deleteNote,showNotes}=require("./functions.js")
const command=argv._[0]
const title=argv._[1]
const date=argv._[2]

if(command==="Add"){
    addNote(title,date)
}
else if(command=="View"){
    viewNote(title)
}
else if(command==="delete"){
    deleteNote(title)
}
else{
    showNotes()
}
