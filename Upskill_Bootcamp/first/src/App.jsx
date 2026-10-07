import './App.css'
function App() {
  let name = "Demo1"
  let ar=[12,34,45,56,78]
  return (
    <>
      <h1>My first Application is {name}</h1>
      <h2>Demo</h2>
      <h2>{ar.map((n)=><p>{n}</p>)}</h2>
      <h2>Sum of array elemets are</h2>
      <h2>{ar.reduce((n,n1)=>n+n1)}</h2>
    </>
  )
}

export default App
