import React, { useState } from 'react'

function Counter() {
    let[count,setCount]=useState(0)
  return (
    <div>
        {count}
        <br></br><button onClick={()=>setCount(count+1)}>Count</button> 
        <button onClick={()=>setCount(count-1)}>Dec</button>
    </div>
  )
}

export default Counter