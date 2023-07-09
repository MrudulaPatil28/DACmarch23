import React from 'react';
import "./Login.css";
import Footer from '../Header/Footer';

function SignUp() {
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
  <title>SignUp</title>
  <div className="box">
    <div className="container">
      <div className="loginbox">
        <div className="top">
          <span>Register</span>
          <header>Sign Up</header>
        </div>
        <div className="input-field">
          <input
            type="text"
            className="input"
            placeholder="Enter Username..."
            autoComplete="off"
            pattern="^[A-Za-z\s]{3,20}"
            title="Do not Enter numeric value"
            minLength={5}
            maxLength={20}
            required=""
          />
          <i className="bx bx-user" />
        </div>
        <div className="input-field">
          <input
            type="email"
            className="input"
            placeholder="Enter Email..."
            id="email"
            autoComplete="off"
            pattern="[a-z]+@[a-z0-9-]+.[a-z]{5,}$"
            title="Enter valid email id"
            required=""
          />
          <i className="bx bx-user" />
        </div>
        <div className="input-field">
          <input
            type="mobile"
            className="input"
            placeholder="Enter Mobile Number..."
            id="mobileNumber"
            autoComplete="off"
            title="Enter 10 digit valid number"
            pattern="[789][0-9]{9}"
            minLength={10}
            maxLength={10}
            required=""
          />
          <i className="bx bx-user" />
        </div>
        <div className="input-field">
          <input
            type="password"
            className="input"
            id="password"
            placeholder="Enter Password..."
            pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$&]).{8,30}"
            title="Min 8 charaters, Must contain: 1st letter Upper case, 1 lower case, 1 number, 1 symbol(!@#$&)"
            autoComplete="off"
            minLength={8}
            maxLength={30}
            required=""
          />
          <i className="bx bx-lock-alt" />
        </div>
        <div className="input-field">
          <input type="button" className="submit" defaultValue="Submit" id="" />
        </div>
        <div className="two-col">
          <div className="one">
            <input type="checkbox" name="" id="check" />
            <label htmlFor="check"> Remember Me</label>
          </div>
        </div>
      </div>
    </div>
  </div>

  <Footer/>

</>

  )
}

export default SignUp;