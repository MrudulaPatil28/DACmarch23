import React from 'react';
import "./Login.css";
import Footer from '../Header/Footer';

function Login() {
  return (
    <>
  <meta charSet="UTF-8" />
  <meta httpEquiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="Login.css" />
  <link
    href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css"
    rel="stylesheet"
  />


  <title>Login</title>

  <section className='loginbox'>
  <div className="box">
    <div className="container">
    <div class='loginbox'>
      <div className="top">
        <span>
          Don't have an account? <a href="SignUp.html">Sign Up</a>
        </span>
        <header>Login</header>
      </div>

      <div className="input-field">
        <input 
        type="email" 
        class="input" 
        id="email"
        placeholder="Enter Email"
        pattern="[a-z]+@[a-z0-9-]+\.[a-z]{2,}$"
        spellCheck="false"
        required
        />
        <i className="bx bx-user" />
      </div>
      <div className="input-field">
        <input
          type="Password" 
          class="input" 
          id="password"
          placeholder="Enter Password" 
          pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$&]).{8,}"
          required
        />
        <i className="bx bx-lock-alt" />
      </div>
      <div className="input-field">
        <input type="button" className="submit" defaultValue="Login" id="" />
      </div>
      <div className="two-col">
        <div className="one">
          <input type="checkbox" name="" id="check" />
          <label htmlFor="check"> Remember Me</label>
        </div>
        <div className="two">
          <label>
            <a href="#">Forgot password?</a>
          </label>
        </div>
      </div>
      </div>
    </div>
  </div>

  </section>

  <Footer/>
  
</>
  )
}

  export default Login;