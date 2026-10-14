import { useState,useEffect } from 'react'
import axios from 'axios'
import './App.css'

import EmpList from './components/EmpList'

function App() {
  const [name, setName] = useState([])
useEffect(()=>{
  axios.get("http://localhost:1234/person")
  .then((res)=>setName(res.data))
  .catch((err)=>console.log("error"))
})
  return (
    <>
      <EmpList name={name}></EmpList>
    </>
  )
}

export default App

