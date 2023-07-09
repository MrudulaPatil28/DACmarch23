import React from 'react';
import "./About.css";
import aboutImg from "../../images/lib4.jpg";

const About = () => {
  return (
    <section className='about'>
      <div className='container'>
        <div className='section-title'>
          <h2>About</h2>
        </div>

        <div className='about-content grid'>
          <div className='about-img'>
            <img src = {aboutImg} alt = "" />
          </div>
          <div className='about-text'>
            <h2 className='about-title fs-26 ls-1'>About BookHub</h2>
            <p className='fs-17'>One web page for every book ever published. It's a lofty but achievable goal.</p>
            <p className='fs-17'>To build Open Library, we need hundreds of millions of book records, a wiki interface, and lots of people who are willing to contribute their time and effort to building the site.</p>
            <p className='fs-17'>To date, we have gathered over 20 million records from a variety of large catalogs as well as single contributions, with more on the way.</p>
            <p className='fs-17'>Open Library is an open project: the software is open, the data are open, the documentation is open, and we welcome your contribution. Whether you fix a typo, add a book, or write a widget--it's all welcome. We have a small team of fantastic programmers who have accomplished a lot, but we can't do it alone!</p>
            <p className='fs-17'>Open Library is a project of the non-profit 
            <a>Internet Archive</a>, and has been funded in part by a grant from the 
            <a>California</a> 
            <a>State Library</a> and the Kahle/Austin Foundation.</p>
           
          </div>
        </div>
      </div>
    </section>
  )
}

export default About;
