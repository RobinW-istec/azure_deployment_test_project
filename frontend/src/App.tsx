import { useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'
import {GetDataComponent} from "./components/GetDataComponent";

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
      <div>
        <a href="https://reactjs.org" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
      </div>
        <div> Hier ist ein neuer commit !!! 1 </div>
      <GetDataComponent/>
    </div>
  )
}

export default App
