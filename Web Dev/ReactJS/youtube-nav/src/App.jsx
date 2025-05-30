import './App.css';

function App() {
  return (
    <div className="ytnav">
      <div className="brand">
        <img src="/ytlogo.png" alt="YouTube Logo" />
      </div>

      <div className="search">
        <div className="search-container">
          <input className="searchip" type="text" placeholder="Search" />
          <button className="search-btn">🔍</button>
        </div>
        <button className="mic-btn">🎙️</button>
      </div>

      <div className="action">
        <button className="action-btn">➕ Create</button>
        <div className="notif-btn">
          <button className="icon-btn">🔔</button>
        </div>
        <div className="avatar" />
      </div>
    </div>
  );
}

export default App;