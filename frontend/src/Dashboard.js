import React, { useState } from 'react';

function Dashboard() {
  const [from, setFrom] = useState('');
  const [to, setTo] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`Finding a taxi from: ${from} to: ${to}`);
    
  };

  return (
    <div>
      <h1>TaxiFinder Dashboard</h1>
      <p>Welcome to your dashboard. Taxi locations will be displayed here.</p>
      
      <form onSubmit={handleSubmit}>
        <div>
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
        <div>
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
    </div>
  );
}

export default Dashboard;