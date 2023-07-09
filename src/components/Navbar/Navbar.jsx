import React, {useState} from 'react';
import { Link } from 'react-router-dom';
import "./Navbar.css";
import logoImg from "../../images/logo1.jpg";
import {HiOutlineMenuAlt3} from "react-icons/hi";

const Navbar = () => {
  const [toggleMenu, setToggleMenu] = useState(false);
  const handleNavbar = () => setToggleMenu(!toggleMenu);

  return (
    <nav className='navbar' id = "navbar">
      <div className='container navbar-content flex'>
        <div className='brand-and-toggler flex flex-sb'>
          <Link to = "/" className='navbar-brand flex'>
            <img src = {logoImg} alt = "site logo" />
            <span className='headtext-uppercase fw-7 fs-24 ls-1'>Bookhub</span>
          </Link>
          <button type = "button" className='navbar-toggler-btn' onClick={handleNavbar}>
            <HiOutlineMenuAlt3 size = {35} style = {{
              color: `${toggleMenu ? "#fff" : "#010101"}`
            }} />
          </button>
        </div>

        <div className={toggleMenu ? "navbar-collapse show-navbar-collapse" : "navbar-collapse"}>
          <ul className = "navbar-nav">
            <li className='nav-item'>
              <Link to = "book" 
              className='nav-link text-uppercase text-white fs-22 fw-6 ls-1'>
                Home</Link>
            </li>
            <li className='nav-item'>
              <Link to = "about" 
              className='nav-link text-uppercase text-white fs-22 fw-6 ls-1'>
                about</Link>
            </li>
            <li className='nav-item'>
              <Link to = "aboutus" 
              className='nav-link text-uppercase text-white fs-22 fw-6 ls-1'>
                aboutus</Link>
            </li>
            <li className='nav-item'>
              <Link to = "contactus" 
              className='nav-link text-uppercase text-white fs-22 fw-6 ls-1'>
                Contact us</Link>
            </li>
            <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            LOGIN
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Admin</a></li>
            <li><a class="dropdown-item" href="#">Student</a></li>
            
          </ul>
        </li>
          </ul>
        </div>
      </div>
    </nav>
  )
}

export default Navbar