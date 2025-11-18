import React, { useEffect } from 'react'
import { Outlet, useNavigate } from 'react-router-dom'
import { useAuth } from './AuthContext';

const ProtectedRoutes = () => {
  const navigate = useNavigate();
  
  const {isAuthenticated} = useAuth();

  useEffect(()=>{
    if(!isAuthenticated){
      navigate('/login')
    }
  },[isAuthenticated,navigate]);

  return isAuthenticated?<Outlet/>:null;
}

export default ProtectedRoutes