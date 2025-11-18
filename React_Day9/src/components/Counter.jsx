import React, { useState } from 'react'

const Counter = () => {
    const [count,setCount] = useState(0);

    const increment = ()=>{
        setCount(count+1);
    }
    const decriment = () => {
        setCount(count-1);
    }

  return (
    <>
      <h2>Count : <span>{count}</span> </h2>
      <button onClick={increment}> Increment </button>
      <button onClick={decriment}> Decriment </button>
    </>

  )
}

export default Counter