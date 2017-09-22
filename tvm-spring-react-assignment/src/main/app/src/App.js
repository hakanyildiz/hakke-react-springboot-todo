import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import TvmLoginComponent from './TvmLoginComponent';

class App extends Component {

  constructor(props){
    super(props);
    this.state = {
    }
  }

  render() {
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Tvm Media Assignment</h2>
        </div>
        <div className="container">
          <TvmLoginComponent />
        </div> 
      </div>
    );
  }
}

export default App;
