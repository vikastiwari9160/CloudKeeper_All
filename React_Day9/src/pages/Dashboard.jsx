import { Outlet} from "react-router-dom"
import Navbar from "../components/Navbar"

const Dashboard = () => {
  return (
    <>
        <h1>Dashboard</h1>
        <Navbar/>
        <Outlet/>
    </>

  )
}

export default Dashboard