import "./AboutUs.css";

export default function AboutUs()
{
        return (
            <>
              <div className="container-fluid">
                <section className="hero">
                  <div className="heading">
                    <h1 style={{ display: "flex", justifyContent: "center" }}>
                      About Us
                    </h1>
                  </div>
                  <div className="row">
                    <div
                      className="col-sm-12 col-md-5 my-5 border"
                      style={{ boxShadow: "0 0 10px rgba(0, 0, 0, 0.5)" }}
                    >
                      <h2 className="hero-content-h2">BookHub</h2>
                      <p style={{ textAlign: "justify" }} className="hero-content-p">
                      
            <p className='fs-17'>One web page for every book ever published. It's a lofty but achievable goal.</p>
            <p className='fs-17'>To build Open Library, we need hundreds of millions of book records, a wiki interface, and lots of people who are willing to contribute their time and effort to building the site.</p>
            <p className='fs-17'>To date, we have gathered over 20 million records from a variety of large catalogs as well as single contributions, with more on the way.</p>
            <p className='fs-17'>Open Library is an open project: the software is open, the data are open, the documentation is open, and we welcome your contribution. Whether you fix a typo, add a book, or write a widget--it's all welcome. We have a small team of fantastic programmers who have accomplished a lot, but we can't do it alone!</p>
            <p className='fs-17'>Open Library is a project of the non-profit 
            <a>Internet Archive</a>, and has been funded in part by a grant from the 
            <a>California</a> 
            <a>State Library</a> and the Kahle/Austin Foundation.</p>
                      </p>
                    </div>
                    <div className="col-sm-12 col-md-7   ">
                      <img
                        src="/extra10.jpg"
                        alt=""
                        className="imgOldPerson"
                        style={{ height: "300px", width:"100%" }}
                      />
                    </div>
                  </div>
                </section>
              </div>
              
              <div className="container d-flex">
                <div className=" row justify-content-center">
                    <div className="col-sm-4 border 2px">
                        <img src="/about3.jpg" className="bookimg"/>
                    </div> 
                    <div className="col-sm-4 border 2px">
                        <img src="/about4.jpg" className="bookimg"/>
                    </div>
                    <div className="col-sm-4 border 2px ">
                        <img src="/about6.jpg" className="bookimg"/>
                    </div>
                </div>
              </div>
              <div
                className="details"
                style={{ display: "flex", justifyContent: "center", color: "Coral" }}
              >
                <h1 style={{ height: "10px" }}>OUR TEAM</h1>
              </div>
              <br />
              <br />
              <div
                className="row justify-content-center p-5 border border-5 border-shadow p-3 mb-5 bg-dark-subtle rounded"
                style={{
                  boxSizing: "border-box",
                  margin: "0%",
                  padding: "0%",
                  display: "flex",
                  justifyContent: "space-between",
                }}
              >
                <div className="col-sm-12 col-md-3">
                  <div className="card">
                    <img
                      src=""
                      className="card-img-top imgUs"
                      alt=""
                    />
                    <div className="card-body">
                      <h5>Ankit Shewale</h5>
                      <p className="card-text">
                        Currently Pursuing PGDAC from CDAC MUMBAI
                      </p>
                    </div>
                  </div>
                </div>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <div className="col-sm-12 col-md-3">
                  <div className="card">
                    <img
                      src=""
                      className="card-img-top imgUs"
                      alt=""
                    />
                    <div className="card-body">
                      <h5 className="card-title">Mrudula Patil</h5>
                      <p className="card-text">
                        Currently Pursuing PGDAC from CDAC MUMBAI
                      </p>
                    </div>
                  </div>
                </div>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <div className="col-sm-12 col-md-3">
                  <div className="card">
                    <img
                      src=""
                      className="card-img-top imgUs"
                      alt=""
                    />
                    <div className="card-body">
                      <h5 className="card-title">Ankit Sharma</h5>
                      <p className="card-text">
                        Currently Pursuing PGDAC from CDAC MUMBAI
                      </p>
                    </div>
                  </div>
                </div>
              </div>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <div
                className="row bg-dark justify-content-center align-item-center"
                style={{
                  boxSizing: "border-box",
                  margin: "0%",
                  padding: "1vh",
                }}
              >
                
              </div>
            </>
          );
}

