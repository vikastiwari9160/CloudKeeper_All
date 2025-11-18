import React, { createContext, useContext, useState } from 'react'
import { useNavigate } from 'react-router-dom';

const AuthContext = createContext();

const useAuth =()=>{
    return useContext(AuthContext);
}

const AuthProvider = ({ children }) => {

    const navigate = useNavigate();

    const [isAuthenticated ,setIsAuthenticated] = useState(()=>{
        const token = localStorage.getItem("isAuthenticated");
        return token==="true"
    });

    const login = () =>{
        setIsAuthenticated(true);
        localStorage.setItem("isAuthenticated",true);
        navigate('/dashboard');
    }

    const logout = () =>{
        setIsAuthenticated(false);
        localStorage.setItem("isAuthenticated",false);
        navigate('/login');
    }
    
    return (
        <AuthContext.Provider value={{isAuthenticated, login, logout}}>
            {children}
        </AuthContext.Provider>
    )
}

export {AuthProvider, useAuth};