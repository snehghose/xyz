import React from 'react';
import './App.css';
import Header from './site/header/Header';
import Footer from './site/footer/Footer';
import Dashboard from './dashboard/Dashboard';

function App() {
    return (
        <div className="App">
            <Header/>
            <Dashboard/>
            <Footer/>
        </div>
    );
}

export default App;
