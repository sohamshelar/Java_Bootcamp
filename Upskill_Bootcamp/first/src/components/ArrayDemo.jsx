import { useState } from "react"

function ArrayDemo()
{
    let arr=[]
    let[name,setName]=useState([])
    function addElement(e)
    {
        e.preventDefault()
        let nm=e.target.txt.value

        console.log(nm)
        setName((n)=>[...n,nm])
        console.log(name)
    }
    return(
        <>
        <form onSubmit={addElement}>
            Enter number <input type="text" name="txt"></input><br></br>
            <input type="submit" value="Add"></input>
        </form>
        <br></br>
        <div>
            {name.map((n)=><p key={n}>{n}</p>)}
        </div>
        </>
    )
}
export default ArrayDemo