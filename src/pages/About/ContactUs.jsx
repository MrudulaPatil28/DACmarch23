import React from 'react';
import "./ContactUs.css";


function ContactUs() {
  return (

<>
  <meta charSet="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title> Contact Us </title>
  <link
    rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
    crossOrigin="anonymous"
  />
  <link rel="stylesheet" href="ContactUs.css" />
  <section className="contact">
    <div className="content">
      <h2>Contact Us</h2>
      <p>
        No matter what kind of information you are looking for we are happy to
        help and provide you with fast, comprehensive support.
      </p>
    </div>
    <div className="container">
      <div className="contactInfo">
        <div className="box">
          <div className="icon">
            <i className="fa fa-map-marker" aria-hidden="true" />
          </div>
          <div className="text">
            <a href="https://goo.gl/maps/ssc67wHA5p7ebeAf6">
              <h3>Address</h3>
            </a>
            <p>
              Dnyaneshwar marg, Juhu
              <br />
              Mumbai,India,
              <br />
              14568
            </p>
          </div>
        </div>
        <div className="box">
          <div className="icon">
            <i className="fa fa-phone" aria-hidden="true" />
          </div>
          <div className="text">
            <h3>Phone</h3>
            <p>123456789</p>
          </div>
        </div>
        <div className="box">
          <div className="icon">
            <i className="fa fa-envelope-o" aria-hidden="true" />
          </div>
          <div className="text">
            <h3>Email</h3>
            <p>bookhub@gmail.com</p>
          </div>
        </div>
      </div>
      <div className="contactForm">
        <form>
          <h2>Send Message</h2>
          <div className="inputBox">
            <input type="text" required="required" />
            <span>Full Name</span>
          </div>
          <div className="inputBox">
            <input type="email" required="required" />
            <span>Eamil</span>
          </div>
          <div className="inputBox">
            <textarea name="" id="" required="required" defaultValue={""} />
            <span>Type your Message...</span>
          </div>
          <div className="inputBox">
          <input type="button" value="Send"/>
          </div>
        </form>
      </div>
    </div>
  </section>
</>

)
}

export default ContactUs;
