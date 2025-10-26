import React, { useState } from 'react';
import './Dashboard.css';

function Dashboard() {
  const [from, setFrom] = useState('');
  const [to, setTo] = useState('');
  const [message, setMessage] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();
    setMessage('Finding a taxi...');

    try {
      const response = await fetch('/api/locations', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ from, to }),
      });

      if (response.ok) {
        setMessage('Your request has been received! We are looking for a taxi.');
        setFrom('');
        setTo('');
      } else {
        setMessage('Something went wrong. Please try again.');
      }
    } catch (error) {
      setMessage('Failed to connect to the server. Please try again later.');
      console.error('There was an error!', error);
    }
  };

  return (
    <div className="dashboard-container">
      <h1>TaxiFinder Dashboard</h1>
      <p>Welcome to your dashboard. Find a ride below.</p>
      
      <form onSubmit={handleSubmit} className="find-taxi-form">
        <div className="form-group">
          <label htmlFor="from">From:</label>
          <input
            type="text"
            id="from"
            value={from}
            onChange={(e) => setFrom(e.target.value)}
            placeholder="Starting location"
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="to">To:</label>
          <input
            type="text"
            id="to"
            value={to}
            onChange={(e) => setTo(e.target.value)}
            placeholder="Destination"
            required
          />
        </div>
        <button type="submit">Find Taxi</button>
      </form>
      {message && <p className="message">{message}</p>}
    </div>
  );
}

export default Dashboard;