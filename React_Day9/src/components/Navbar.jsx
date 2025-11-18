import React from 'react'
import { Link } from 'react-router-dom'
import { useAuth } from './AuthContext'

const Navbar = () => {
  const {logout} =  useAuth();

  return (
    <>  
    <ul className='Dashboard-nav-list'>
        <li className='Dashboard-nav-ele'>
            <Link to={'counter'}>counter</Link>
        </li>
        <li className='Dashboard-nav-ele'>    
            <Link to={'digitalwatch'}>DigitalWatch</Link>
        </li>
    </ul>
    <button onClick={logout}>Logout</button>
    </>
  )
}

export default Navbar