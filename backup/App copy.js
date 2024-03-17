import logo from './logo.svg';
import './App.css';
//import ResponAppsiveAppBar from './components/Appbar';
import Appbar from './components/Appbar';

function App() {
  return (
    <div className="App">
    <Appbar/>

      This is Andy Codes.
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  
  );
}

//export default App;
