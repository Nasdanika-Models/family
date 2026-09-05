
```drawio-resource
../family.drawio
```

An [Ecore](https://www.eclipse.org/modeling/emf/) micro-model of the family as an organization: members who provide, consume, develop, and transfer capabilities across generations, with kinship as typed relationships and [GEDCOM](https://www.gedcom.org/) as the interoperability format.

[TOC levels=6]


This model takes over the [original family model](https://family.models.nasdanika.org/original).
The original family model purpose was to mimic the [Eclipse Sirius Basic Family Model](https://wiki.eclipse.org/Sirius/Tutorials/BasicFamily) at a time when Draw.io was the only authoring surface, and it is kept for side-by-side comparison and as the teaching example behind the [semantic mapping demo](https://nasdanika-demos.github.io/family-semantic-mapping/).

## Position: the top of the tower

The family model sits at the very top of the micro-model tower, on the [org design model](https://org-design.models.nasdanika.org/).

The initial design went the other way: a genealogy balcony off the lowest floor, climbing as the tower grew.
The reversal is the insight. A family *is* an organization: members with capabilities, concerns to resolve, decisions to make and bind, work to do, events to remember, things to govern.
Placed at the top, the model becomes nearly nothing, because the tower provides:

* A member is an org design Person, hence a capability provider and a persona with concerns (product management), an architecture element, workable, governed, staged, access controlled, owned, documented, with provenance.
* Kinship ties are architecture relationships with kind catalogs (parent, spouse; biological, adoptive, step, foster), so the [family-ties demo](https://github.com/Nasdanika-Demos/family-ties) vocabulary is instance data in the model itself.
* Events shrink onto the NxCore `Event` (a named, documented Temporal); GEDCOM's approximate and range dates collapse into nxcore temporals.
* What this model actually contributes: kinship semantics, GEDCOM round-tripping (xrefs), and the domain's two-century-old provenance discipline (sources, citations, quality ratings).

Every move up deleted something. The tower got taller and the model got smaller.

Some things moved down.
The top floor is the tower's heaviest test load and its best source of validated concepts: what a family model needs is what centuries of genealogical practice have already worked out, and once such a concept is confirmed on this floor it drops to the floor where it belongs and every model above benefits.
Architecture elements were temporal; they now also carry place and jurisdiction (presence in NxCore, jurisdiction in governance) because a family model must record that a person lived in one house through three countries without moving, and every estate and org model gets the same coordinates for free.
The test load is two centuries of GEDCOM: thousands of entities per file, every relationship type the domain ever invented, freely available, which no enterprise dataset offers.

## Why the family

Selling model-driven anything to organizations is famously hard: it is not people's own money and not people's own inefficiencies.
In families it is both.
Organizations also say that modeling is too complex and that tribal knowledge rules.
Take the phrase at its word.
A tribe is a kinship organization, and tribal knowledge is what fits in the heads of people who all know each other, which is why it has a ceiling: Dunbar put the number of relationships a head can hold near 150, and the critics argue about the number rather than about the ceiling.
Families have modeled themselves for millennia precisely to get past it.
Genealogies are among the oldest records that exist, actual tribes kept designated keepers of them, and a clan with a written lineage could hold obligations across thousands of members and several centuries.
A family model is complex, and the families that found it too complex are the ones history does not mention.
There are millions of developers and tech-savvy people with families, every one of them owning exactly one dataset they are guaranteed to still care about in thirty years.
And because the model sits at the top of the tower, it exercises every floor below it: the family model is the showcase, and the showcase is how organizations discover the tower.

## Horizon: generations, not quarters

Some of the largest organizations in the world are families.
Samsung is a family business, and so are Ford, Mars, Cargill and Hermès; the Rothschilds ran a banking network out of five cities through five sons before anyone had drawn an org chart.
What separates a family from a company is not structure, since the tower shows they share one, but horizon.
A company plans in quarters and, on a good day, in years.
A family that intends to remain one plans in generations, and the proverb about shirtsleeves to shirtsleeves in three generations records what happens to the ones that do not.

The model is designed for that horizon.
Events are dated to whatever precision the source allows, including "about" and "between".
Decisions are bound and revisited, never overwritten, so the reasoning behind a choice made in one generation is readable in the next.
Capabilities are provided, developed, and transferred between members, so what a family knows how to do is as much a part of its record as who was born when.
A member's record is expected to outlive the member.

The founding ask, a picture of the tree, was a long-horizon organization requesting a view of its own state. The second ask, from the same relative, was a chapter for the family book.
The third is a CV for the next generation. All three are views of one record, and the record is what gets inherited.

## What survives

The trust posture is a requirement, not a feature: the core is open source and the family owns the model, locally, in Git, inalienably.
Providers and agents interact with projections of the model, not the model itself.

Ownership alone is not enough over a thirty-year horizon; the question is what still opens.
The test applied here is a survivability test, and it is applied to Nasdanika itself: suppose Nasdanika disappears.

* **Model files are plain text.** Xcore, Ecore XMI, Draw.io XML, Groovy DSL, Markdown, and GEDCOM itself. Readable in any editor, diffable and mergeable in Git, recoverable with no Nasdanika tooling at all.
* **Released artifacts are immutable.** Nasdanika publishes to Maven Central, which does not delete what has been published; every version a family ever used remains resolvable.
* **The command-line distribution bundles its dependencies down to the JVM.** A family archives one distribution beside its model and regenerates every view without a network. The JVM itself is past thirty and still executes class files compiled in the nineties.
* **The data shape is on the model's side.** A family record is thousands of entities, not billions, densely related, and expected to matter for a century. The industry optimizes for the opposite: huge volumes of simple, short-lived records. Small, complex, and permanent is the corner Nasdanika is built to occupy.

Everything a family can do with its model the day Nasdanika stops, it can do the day after, from a flash drive in a safe.
That is a stronger promise than a cloud vendor can make, not because clouds lose data, which they rarely do, but because they retire products, and a family record has to outlive the product that created it.

## Applications

In the spirit of the [product management model](https://product-management.models.nasdanika.org/): personas hold concerns, capabilities are pulled by concerns, and AI operates on scoped contexts.
The family flips the usual direction: instead of providers pushing products, the family models its concerns and pulls.

**Family tree as generated views.** The founding use case: a relative asks for a picture.
Wall chart, interactive Draw.io diagram, static site, descendants report, research list: all renderings of one model, regenerated on change, with photographs and stylized icons generated from photographs where a photo should not be public.

**Research agent.** Find evidence that a great-grandfather worked for the railroad between 1900 and 1920: locate the person, correlate residences and occupations, search newspaper and census archives, return claims with citations and quality ratings.
A historian swarm generalizes this: specialized agents (newspapers, census, military, immigration) each work a scoped partition and publish findings back with receipts.

**Life stories and knowledge preservation.** Biographies, timelines, documentary scripts, and oral-history interview guides generated from the graph, grounded in cited events.
A member's chapter of the family book is the same generation narrowed to one person: events, residences, occupations, the people who were there, the sources that say so, in the family's own template, regenerated when research adds a fact.
The interview with the oldest living relative is the one deadline in genealogy that is real; the work floor holds it.

**Career and opportunity intelligence.** A family is a latent capability network that LinkedIn ignores.
Concern: a daughter wants a biotech internship.
The graph knows the grandmother's cousin is on a hospital board and the uncle is a health-insurance actuary.
Agents answer capability questions: what careers have succeeded in this family, who can mentor whom, what is the family's composite capability, what is missing for the venture three cousins keep talking about.
A resume is a projection of a member's capability subgraph for a purpose, not a document: the family-book chapter narrowed to one audience. The next generation inherits the record, not a stack of stale documents, and generates its own CVs from it when the time comes..

**Provisioning: analysis and binding, not recommendations.** Concern: pay for college.
The system does not recommend a provider; it computes a decision space (loans, savings plus scholarships, community college and transfer), the family binds a decision, and only then does the next layer of decisions materialize.
Plans are living decision graphs: revisit a binding (the scholarship fell through) and downstream consequences recompute.
AI computes consequence spaces; humans bind decisions.
The same pattern covers first-home purchase, elder-care alternatives, and education strategy.

**Accounts that are not money.** The accounting floor serves the family beyond finances.
Covey's emotional bank account, political capital, and the favor economy of every dynasty in fiction (The Godfather opens with a favor being booked against a future call) are accounts with a unit that is not currency, and the model treats them as such: entries, balances, dated, with the same provenance as a bank transaction.
Where there is a favor ledger there is concentration analysis, borrowed from risk governance: who holds the balances, on whom the family depends, and what changes when a large balance is spent at once.
Like valence, favor balances are among the most sensitive content in the model and sit behind the same access control.

**Structure, liability, and threat.** Families hold assets through structures (trusts, the LLC that owns the rental house, in some jurisdictions anonymous ownership entities) and manage exposure through controls (the waiver a party guest signs, the insurance on the boat, the power of attorney in the drawer).
That is ownership, governance, and threat modeling, floors the tower already has: the structure is an organization the family owns, the exposure is a threat with a likelihood and an impact, the control is a mitigation with an owner and a review date.
The model does not give legal advice; it records what the family decided, why, and when it is due for revisiting.

**Protected overlays.** Hereditary health patterns and family finances (trusts, ownership, succession) are separate overlay models composed through scoped contexts and access control.
The newspaper-research agent never sees genetic markers; the medical agent never sees trust beneficiaries.
Audience-tiered publishing works the same way: full site for close family, names-only for distant relatives, deceased-only for the public, one model, three generated sites.

**Family as capability provider.** The family is not only a consumer: mentoring, caregiving, housing, introductions, and investment are capabilities members provide to each other, and the model makes the exchange visible, which is what turns a tree of ancestors into a living capability ecosystem.

**Ties beyond kinship, and their quality.** A family graph that stops at blood and marriage is missing most of what a family is.
Godparents, caregivers, step-relations, the neighbour who is effectively an aunt, the friend a member would call first: genealogical practice has always recorded these, and family-systems practice records them as a matter of course.
They need no new classes here, because a tie is a relationship with a kind, and *friend*, *mentor*, *godparent*, *caregiver*, *household member* are catalog entries beside *parent* and *spouse*.
What they do need is **quality**. Standard genogram notation, which practitioners have used for decades, draws a tie's character as well as its existence: close, distant, conflictual, estranged, cut off, fused.
Modeled as a dated valence on the tie - an assessment like every other assessment on the tower, so a reconciliation is a new record rather than an overwritten field - the tree gains explanatory power: patterns repeat across generations, estrangements have dates, and "who in this family actually talks to whom" becomes answerable.

**Personal development, and coaching as a provided capability.** The floors that answer a family's concerns answer an individual member's.
A member holds concerns in the product management sense - goals, needs, pain points - and capabilities whose maturity is a dated, evidenced assessment rather than a self-rating.
That is, structurally, the instrument a coach already uses: the wheel of life is a concern-domain catalog scored per person, a strengths inventory is a capability assessment, and GROW is decision plus work.
Because these are tower floors rather than a separate app, a member's development plan and the family's provisioning decisions are one graph: a teenager's career concern pulls against the family's own capability network, and the mentor uncle is a provider like any other.
A coach, therapist, tutor, or financial planner engaged by the family is likewise a capability provider working against a scoped, access-controlled projection - not the model itself.

**Storytelling, biography, and explanatory casts.** The model is a structure for enumerating a life: events, residences, occupations, ties, capabilities, decisions.
That is what a biographer assembles before writing and what a novelist assembles before a long book.
Long fiction has always been model-driven; Zola planned the twenty Rougon-Macquart novels from a genealogical tree drawn before the first one, Tolkien's appendices are a data model with a narrative on top, and publishers print the family trees readers need to follow Tolstoy.
The model is usually on paper and in a proprietary worldbuilding app.
The same pipeline that produces a member's chapter of the family book produces a character's, and a myth or a novel is a source like any other, cited with the confidence it deserves.
Explanatory casts are the same move in miniature: cryptography has explained protocols with Alice, Bob, Eve and Mallory for decades, a cast of personas with roles and ties, and a cast is how a concept gets a story.
A cast is an organization-design persona catalog rather than a family, so it lives one floor down, but it renders through the same generators.

**Beyond the family.** None of the mechanics above are family-specific; the family is where they show up with the least politics.
A person's private work record (projects, roles, people worked with, dated and evidenced) is the same structure as a member's record; a team or a project can keep its own small model of members, partners, vendors, and the relationships that form as work progresses, and share projections with whoever is willing.
No enterprise-wide model is required for a team model to pay for itself, and an organization that cannot match what its people can do to what its work needs is missing exactly the capability record the family model keeps for its children.
That application has its own home on the org design and capability floors; the family model is its proof at household scale.

## Public demo: Greek mythology

The public demo is built on Greek mythology rather than on a real family, for reasons that go beyond taste.
Nobody on Olympus has an expectation of privacy, and a myth is a citation: Hesiod and Homer disagree about Aphrodite's parentage, which is what citation quality ratings exist to record, and the disagreement is one every reader already knows.
Valence has a canon, too: Poseidon's wrath at Odysseus is a dated assessment on a tie, with the blinding of Polyphemus as its citing event, Athena's patronage is the same mechanism with the opposite sign, and Zeus and Hera supply the conflictual marriage.
Time is relative in the way NxCore temporals are relative: primordials, Titans, Olympians, heroes, and "the generation before the Trojan War" is a legitimate date.

The demo is federated. The Olympians are one model, published on their own and knowing nothing of Ithaca.
Odysseus, Laertes, Penelope, and Telemachus are a second model that references the first; other houses (Atreus, Heracles, Perseus) can each be a third.
A resource set loading both resolves navigation in both directions, with the inverse direction derived from the loaded set rather than stored, which is exactly how a real family's model relates to the in-laws'.
Views include the tree and the graph, with member classification (gods, demigods, mortals) and tie kinds distinguishing colors and strokes, and a time filter showing only what exists in a chosen period.
The graph is an instrument, not decoration: Nasdanika's existing [3D graph viewer](https://medium.com/nasdanika/3d-graphs-for-visualizing-complex-structures-and-behavior-69516e6a2e3d) made clusters among several thousand interdependent systems visible before any analysis ran, the way a molecule's shape is legible before its formula, and a family is a molecule.
Force-directed layout computes the picture from forces on edges, so a signed, weighted valence is literally field theory: fused branches collapse into knots, estranged relatives drift to the periphery, and the member everyone owes sits at the center under tension.
Animated over time it shows the family's history as motion, which is more watchable than a ledger and shows the same facts.
And CVs: Odysseus's, generated from his record, every capability backed by a citation (strategy, the horse, Odyssey VIII; carpentry, the bed, Odyssey XXIII; rhetoric, the embassy to Achilles, Iliad IX; crew retention, none), and Heracles's, tailored to one posting, cleaning the Augean stables in a day, which is the targeted-CV-per-posting case with a documented pay dispute attached.
The generator is deadpan; the humor is in the data.

The demo is also the model's test: if Greek mythology needs a class the model lacks, either the model is wrong or the demo is.
Gods and mortals are a classification, not classes.

## Resources

* [GEDCOM specifications](https://gedcom.io/): GEDCOM 7 specification with sample and test files, and the 5.5.1 specification the major vendors still export.
* [The Greek Mythic Genealogy Project](https://patrickbrianmooney.nfshost.com/~patrick/greek-myth/greek-genealogy.html): a GEDCOM of Greek mythological figures, the seed for the public demo.
* [Wikidata](https://www.wikidata.org/): CC0 kinship claims (father, mother, spouse, child) for mythological figures, the clean-provenance source for the demo dataset, with each fact citing its item and then the myth.
* **Royal92**: the classic public-domain GEDCOM of European royalty (about 3000 individuals), widely mirrored; the public demo dataset, so no family data is exposed while the machinery is shown.
* [gedcom4j](https://github.com/frizbog/gedcom4j): mature Java reader/writer for GEDCOM 5.5/5.5.1; the native line-based Resource is preferred for marker fidelity, with gedcom4j as a reference implementation.
* [Original family model](https://family.models.nasdanika.org/original/) and the [semantic mapping demo](https://nasdanika-demos.github.io/family-semantic-mapping/): the teaching lineage this model grew out of.
* [family-ties demo](https://github.com/Nasdanika-Demos/family-ties): the kinship vocabulary, now expressible as a relationship kind catalog inside the model.

## Model overview

| Area | Types |
|------|-------|
| Root | `Family` (extends org design `Organization`; federates by reference) |
| Members | `Member` (org design `Person` + architecture `Element` + GEDCOM `Record`), `PersonalName`, `Sex` |
| Kinship | `Kinship` (architecture `Relationship`; kinds as catalog; carries FAM xref and family events) |
| Events | `EventKind` (GEDCOM tag catalog), `Event` (shrinks onto NxCore `Event`) |
| Provenance | `Citation` (QUAY quality), `Source`, `Repository` |
| Media and notes | `Media`, `Note` |
