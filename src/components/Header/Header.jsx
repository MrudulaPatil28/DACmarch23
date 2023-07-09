import React from 'react';
import Navbar from "../Navbar/Navbar";
import SearchForm from "../SearchForm/SearchForm";
import "./Header.css";

const Header = () => {
  return (
    <div className='holder'>
        <header className='header'>
            <Navbar />
            <div className='header-content flex flex-c text-center text-white'>
                <h2 className='header-title text-capitalize'>Welcome to Open Library. </h2><br />
                <h3>Find your book of choice.</h3> <br />
                <p className='header-text fs-18 fw-3'> Millions of Books are available through controlled digital lending.</p>
                <SearchForm />
            </div>
        </header>
    </div>
  )
}

export default Header