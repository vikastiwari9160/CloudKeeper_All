import './App.css';
import {Routes, Route, Navigate} from 'react-router-dom';

import Login from './pages/Login';
import NotFound from './pages/NotFound';
import Dashboard  from './pages/Dashboard';
import ProtectedRoutes from './components/ProtectedRoutes';
import Counter from './components/Counter';
import DigitalWatch from './components/DigitalWatch';
import { AuthProvider } from './components/AuthContext';

function App() {

  return (
    <>
      <AuthProvider>
        <Routes>
          <Route element={<ProtectedRoutes/>} >
            <Route path='/' element={<Navigate to={'/dashboard'} replace/>} ></Route>
            <Route path='dashboard' element={<Dashboard/>}>
              <Route path='counter' element={<Counter/>}></Route>
              <Route path='digitalwatch' element={<DigitalWatch/>}></Route>
            </Route>
          </Route>
          <Route path='/login' element={<Login/>}></Route>
          <Route path='*' element={<NotFound/>}></Route>
        </Routes>
      </AuthProvider>
    </>
  )
}

export default App;
