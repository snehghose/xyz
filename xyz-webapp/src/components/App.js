import React from 'react';
import './App.css';
import Header from './site/header/Header';
import Footer from './site/footer/Footer';
import Dashboard from './dashboard/Dashboard';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Cart from './cart/Cart';

function App() {
    return (
        <BrowserRouter>
            <Header/>
            <Switch>
                <Route path="/" exact={true} component={Dashboard}/>
                <Route path="/cart" component={Cart}/>
            </Switch>
            <Footer/>
        </BrowserRouter>  
    );
}

export default App;
