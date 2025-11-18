import React, { useEffect, useState } from 'react'

const DigitalWatch = () => {
    const curDate = new Date();
    const [time,setTime] = useState({
        hour: curDate.getHours(),
        min: curDate.getMinutes(),
        sec: curDate.getSeconds()
    });

    useEffect(()=>{
        const interval = setInterval(()=>{
            const newDate = new Date();
            setTime({
                hour: newDate.getHours(),
                min: newDate.getMinutes(),
                sec: newDate.getSeconds()
            })
            return () => clearInterval(interval);
        },1000);
    },[])

  return (
    <>
        <h2>Digital Watch</h2>

        <h2>
            <span>{time.hour} :</span> 
            &nbsp; 
            <span>{time.min<10?`0${time.min}`:time.min} :</span>
            &nbsp;
            <span>{time.sec<10?`0${time.sec}`:time.sec}</span>
        </h2>
    
    </>

  )
}

export default DigitalWatch