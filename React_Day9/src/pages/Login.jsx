import React, { useEffect } from "react";
import { useAuth } from "../components/AuthContext";
import { useNavigate } from "react-router-dom";


let Login = () => {

    const navigate = useNavigate();

    const {isAuthenticated, login} = useAuth();

    useEffect(()=>{
        if(isAuthenticated) navigate('/');
    },[isAuthenticated,navigate])

    return (
        <>
        <button onClick={login} className="LoginButton">Login</button>
        </>
    )
};

export default Login;