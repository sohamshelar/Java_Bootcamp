import React, { useState } from "react";

function CandidateForm() {
  const [showForm, setShowForm] = useState(false);
  const [form, setForm] = useState({
    Cid: "",
    Cname: "",
    Cemail: "",
    Ccontact: ""
  });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(form.Cemail)) {
      alert("Invalid email format");
      return;
    }

    if (!/^\d{10}$/.test(form.Ccontact)) {
      alert("Contact must be 10 digits");
      return;
    }

    alert("Form submitted successfully!");
    setShowForm(false);
  };

  return (
    <div>
      <button onClick={() => setShowForm(true)}>
        Open Candidate Form
      </button>

      {showForm && (
        <div>
          <h2>Candidate Form</h2>

          <form onSubmit={handleSubmit}>
            <input
              name="Cid"
              placeholder="Candidate ID"
              value={form.Cid}
              onChange={handleChange}
              required
            />

            <br /><br />

            <input
              name="Cname"
              placeholder="Candidate Name"
              value={form.Cname}
              onChange={handleChange}
              required
            />

            <br /><br />

            <input
              name="Cemail"
              type="email"
              placeholder="Candidate Email"
              value={form.Cemail}
              onChange={handleChange}
              required
            />

            <br /><br />

            <input
              name="Ccontact"
              type="text"
              placeholder="10-digit Contact"
              value={form.Ccontact}
              onChange={handleChange}
              required
            />

            <br /><br />

            <button type="submit">Submit</button>
            <button
              type="button"
              onClick={() => setShowForm(false)}
            >
              Close
            </button>
          </form>
        </div>
      )}
    </div>
  );
}

export default CandidateForm;